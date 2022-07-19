package ExceptionsTA10;

public class ExceptionEx2 extends Exception {
	private String code = "Unknown";
    private String message;
    
	public ExceptionEx2 () {
		super();
	}

    public ExceptionEx2 (String code) {
    	super();
        this.code = code;
    }

    public String getMessage() {
    	switch (code) {
        case "1":
            this.message = "This is an object Exception";
            break;
        default:
            this.message = "Unknown error";
            break;
    	}
        return this.message;
    }

}
