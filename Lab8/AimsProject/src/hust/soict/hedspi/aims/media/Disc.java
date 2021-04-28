package hust.soict.hedspi.aims.media;


public abstract class Disc extends Media {
    protected int length;
    protected String director;

    public Disc() {
    }
    
    public Disc(int length, String director) {
		super();
		this.length = length;
		this.director = director;
	}
    
    public Disc(int id ,String title, String category, String director, int length, float cost) {
    	super(id,title,category,cost);
		this.director = director;
		this.length = length;
    }


	public int getLength() {
        return length;
    }
    
    
    public String getDirector() {
		return director;
	}

	@Override
    public void print() {
        System.out.printf("Title: %s.\nCategory: %s.\nCost: %s.\n", getTitle(), getCategory(), getCost());
    }
}
