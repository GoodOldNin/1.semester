surface.setVisible(false);


class TextAnalyser {

  StringBuilder data = new StringBuilder();

  TextAnalyser(String data) {
    this.data.append(data);
  }

  void showWordOnPosition(int pos) {
    String tmp = this.data.toString();    
    String[] tmp2 = tmp.split(" ");    
    println(tmp2[pos]);
  }

  int wordCount() {
    // opdelte vej
    String tmp = this.data.toString();    
    String[] tmp2 = tmp.split(" ");
    int len = tmp2.length;
    return len;

    // method chaining
    //return this.data.toString().split(" ").length;
  }
}

// TYPE VARIABEL_NAVN 
TextAnalyser ta = new TextAnalyser("indsætte noget data...");
ta.showWordOnPosition(   ta.wordCount() -1    )  ;
