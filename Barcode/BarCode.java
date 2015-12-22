public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static final String[] key={"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	_zip=zip;
	_checkDigit=checkSum();
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip=x.getZip();
	_checkDigit=checkSum();
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum=0;
	for (int i=0;i<_zip.length();i++){
	    sum+=_zip.charAt(i);
	}
	_checkDigit=sum%10;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String out=_zip+_checkDigit+"   ";
	for (int i=0;i<_zip.length();i++){
	    out+=key[_zip.charAt(i)];
	}
	return out;
    }


    public boolean equals(Object other){
	return this==other||(other instanceof BarCode && (_zip.equals((BarCode)(other).getZip()))); 
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){
	return this.toString().compareTo(other.toString());
    }
    // postcondition: compares the zip + checkdigit 
    public String getZip(){
	return _zip;
    }
}