package cz.brmlab.yodaqa.flow.dashboard.snippet;

/**
 * This class represents a passage snippet, it contains the text from a passage
 */
public class AnsweringPassage extends AnsweringSnippet{
	protected String passageText;
	public AnsweringPassage(int ID, int sourceID, String passageText) {
		super(ID, sourceID);
		this.passageText = passageText;
	}

	public String getPassageText() {
		return passageText;
	}

}
