package iteratorDisaignPattern;

class BooksCollection implements BuildIterator{
    private String m_titles[] = {"test0","test1","test2","test3","test4"};

    public MyIterator createIterator(){
        BookIterator result = new BookIterator();
        return result;
    }

    @Override
    public MyIterator creatIterator() {
        BookIterator result = new BookIterator();
        return result;
    }

    private class BookIterator implements MyIterator{
        private int m_position;

        public boolean hasNext(){
            if (m_position < m_titles.length)
                return true;
            else
                return false;
        }
        public Object next(){
            if (this.hasNext())
                return m_titles[m_position++];
            else
                return null;
        }
    }
}