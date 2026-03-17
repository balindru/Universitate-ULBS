//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int v[]=new int[5];
    Scanner sc = new Scanner(System.in);
    int n;
    for (int i=0;i<5;i++)
    {
        n = sc.nextInt();
        sc.nextLine();
        v[i]=n;
    }
    for (int i:v)
    {
        System.out.println(i);
    }
    sc.close();
}
