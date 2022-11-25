package level_0;

public class AlienDictionary {
    public int alienDictionary(String[] spell, String[] dic) {
        for (String word : dic) {
        	if (checkWord(spell, word)) {
        		return 1;
        	}
        }
        return 2;
    }

	private boolean checkWord(String[] spell, String word) {
		if (hasAllSpell(spell, word) && onlyOneSpell(spell, word)) {
			return true;
		}
		return false;
	}

	private boolean hasAllSpell(String[] spell, String word) {
		for (String singleSpell : spell) {
			if (!word.contains(singleSpell)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean onlyOneSpell(String[] spell, String word) {
		for (String singleSpell : spell) {
			if (word.indexOf(singleSpell) != word.lastIndexOf(singleSpell)) {
				return false;
			}
		}
		return true;
	}
}