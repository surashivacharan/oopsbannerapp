public class Step7 {

    // UC7: Static inner class to encapsulate character and its ASCII pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return pattern[index];
        }
    }

    public static void main(String[] args) {

        // 7-width consistent patterns

        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Render OOPS banner
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();

            sb.append(charO.getLine(i)).append("  ");
            sb.append(charO.getLine(i)).append("  ");
            sb.append(charP.getLine(i)).append("  ");
            sb.append(charS.getLine(i));

            System.out.println(sb.toString());
        }
    }
}