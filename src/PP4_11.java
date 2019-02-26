public class PP4_11 {
    public static  void main(String[] args)
    {
        for(int i = 32; i <= 126; i++){
            for(int j = 0; j < 4;j++){
                if((i+j)>126){
                    i+=5;
                }else{
                    System.out.print((i+j) + " " + (char)(i+j) + "\t");
                }

            }
            System.out.println();
        }
    }
}

/*
* Design and implement an application that prints a table show-
* ing subset of the Unicode characters and their numeric value
* Print five number/ character pairs per line, separated by tab
* characters. Print the table for numeric value from 32 (the space
* character) to 126 ( the ~ character), which corresponds to the
* printable ASCII subset of the Unicode character set. Compare
* your output to the talb,e in Appendix C. Unlike the values in the
* table in Appendix C, the values in your table can increase as they
* go across a row.
*
*/