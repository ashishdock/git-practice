// Command Line Arguments
class CLArgs{
	public static void main(String args[]){
		int n = args.length;
		System.out.println("No. of arguments = " + n);
		
		System.out.println("The arguments are: ");
		for(int i=0; i<n; i++){
			System.out.println(args[i]);
		}
	}
}