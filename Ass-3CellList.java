/**
 * Name(s) and ID(s): Gulnoor Kaur 40114998, Vraj Patel 40155059
 * COMP 249
 * Assignment #3
 * Part 1
 * Due Date: 19 August 2021
 * 
 * This is a basic SubDictionary creator program that uses ArrayList to store all 
 * the words in the dictionary and has numerous checks if the word contains any special characters 
 *  or numbers or is a single character. 
 */
public class CellList {

	
	/** 
	 * This is an inner class 
	 */
	public class CellNode {
		private CellPhone cellp;
		private CellNode obj;

		
		/**
		 * default constructor
		 */
		public CellNode() {
			cellp = null;
			obj = null;
		}

		
		/**
		 * parameterized constructor
		 * @param p
		 * @param k
		 */
		public CellNode(CellPhone p, CellNode k) {
			cellp = p;
			obj = k;
		}

		 
		/**
		 * copy constructor
		 * @param dup
		 */
		public CellNode(CellNode dup) {
			dup.cellp = this.cellp;
			dup.obj = this.obj;
		}

		/**
		 *  This is a clone method
		 */
		public Object clone() throws CloneNotSupportedException{
			CellNode node = new CellNode();
			node.cellp =this.cellp;
			node.obj = this.obj;
			return node;
		}

		/**
		 * mutator and accessor method
		 * @param p
		 */
		public void setcellp(CellPhone p) {
			cellp = p;
		}

		public CellPhone getcellp() {
			return cellp;
		}

		public CellNode getobj() {
			return obj;
		}

		public void setobj(CellList.CellNode n) {
			obj = n;
		}
	} // End of inner class

	//declaring attributes
	private CellNode head;
	private int size = size();
	public int size() {
		int count =0;
		CellNode position =head;
		while(position != null)
		{
			count++;
			position = position.obj;
		}
		return count;
	}

	
	/**
	 * default constructor
	 */
	public CellList() {
		head =null;
	}

	/**
	 * constructor with one parameter
	 * @param cl
	 */
	public CellList(CellList cl) {
		while(cl.head != null)
		{
			this.head = cl.head;
			cl.head = cl.head.obj;
			this.head = this.head.obj;
		}
	}

	
	/**
	 * method to add cellphone object at start
	 * @param cp1
	 */
	public void addToStart(CellPhone cp1) {
		CellNode node = new CellNode();
		node.cellp = cp1;
		node.obj = head;
		head = node;
	}
	
	/**
	 * method to add cellphone object at any index 
	 * @param ob
	 * @param i
	 * @throws NoSuchElementException
	 */
	public void insertAtIndex(CellPhone ob , int i) throws NoSuchElementException{
		if(i>size-1 || i<0)
		{
			throw new NoSuchElementException();
		}
		else
		{
			if(i==0)
			{
				addToStart(ob);
			}
			else 
			{
				CellNode ex = new CellNode();
				ex.cellp = ob;
				ex.obj = null;
				CellNode c =head;
				for (int j = 0; j<i-1 ; j++)
				{
					c = c.obj;
				}
				ex.obj = c.obj;
				c.obj = ex;
			}
		}
	}
	/**
	 * method to delete cellphone from any index
	 * @param i
	 * @return
	 * @throws NoSuchElementException
	 */
	public CellNode deleteFromIndex(int i) throws NoSuchElementException{
		if(i>size-1 || i<0)
		{
			throw new  NoSuchElementException();
		}
		CellNode ref = head;
		for (int j = 0; j < i-1; j++) {
			ref = ref.obj;
		}
		if (i == 0) {
			head = ref.obj.obj;
		} else {
			ref.obj = ref.obj.obj;
		}
		size--;
		return ref;
	}

	/**
	 * method to delete from start
	 */
	public void deleteFromStart() {
		CellNode p = head.obj;
		head = p;
	}

	/**
	 * method to replace cellphone at any index
	 * @param replace
	 * @param index
	 * @throws NoSuchElementException
	 */
	public void replaceAtIndex(CellPhone replace , int index) throws  NoSuchElementException{
		CellNode cl = gethead();
		if(index<0 || index>this.size())
			throw new NoSuchElementException();
		else if(index==0)
		{
			CellNode newNode = new CellNode();
			newNode.cellp = replace;
			newNode.setobj(head.obj);
			head = newNode;
		}
		int counter = 0;
		while(null != head && counter++ < index - 1) {
			cl=cl.getobj();
		}

		if(null == cl || null == cl.getobj());

		CellNode newNode = new CellNode();
		newNode.cellp = replace;
		newNode.setobj(cl.getobj().getobj());
		cl.setobj(newNode);
	}

	
	/**
	 * method to find the serial number
	 * @param l
	 * @return
	 */
	public CellNode find(long l) {
		CellNode position = head;
		long lAtPosition;
		int count = 0;
		while(position!=null)
		{
			lAtPosition = position.cellp.getserialNum();
			if(lAtPosition==l)
			{
				System.out.println("Number of iteration " + count);
				return position;
			}
			position = position.obj;
			count++;
		}
		return null ;
	}

	
	/**
	 * method to check whether list contains the serial number
	 * @param l
	 * @return
	 */
	public boolean contains(long l) {
		return (find(l)!=null);
	}

	/**
	 * method to print list content on screen
	 */
	public void showContents() {
		System.out.println("The current size of the list is " + size() + ". Here are the contents of the list");
		System.out.println("===============================================================================");
		CellNode position = head;
		int count =0;
		while(position != null) {
			System.out.print("[" +position.getcellp()  + "]" + "---> ");
			position = position.getobj();
			count++;
			if(count==3) {
				System.out.println("");
				count = 0;
			}

		}
		System.out.println("x");
	}

	
	/**
	 * equals method to check equality of two lists
	 * @param list
	 * @return
	 */
	public boolean equal(CellList list) {
		int count =0;
		if(this.size() == list.size()) {
			while(this.head.cellp.equals(list.head.cellp))
			{
				count++;
				this.head = this.head.obj;
				list.head = list.head.obj;
			}
			if(count==this.size)
				return true;
			else
				return false;
		}
		else
			return false;
	}

	
	/**
	 * getter and setter
	 * @param s
	 */
	public void sethead(Object s) {
		head = (CellNode) s;
	}
	public CellNode gethead() {
		return head;
	}
}
