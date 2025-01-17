 class Main {
    public static void main(String[] args) {

        String s = "Google";
        StringBuffer br = new StringBuffer();

        for (int i=s.length()-1; i>=0; i--)
        {
            br.append(s.charAt(i));
        }
        System.out.println(br);

    }
}