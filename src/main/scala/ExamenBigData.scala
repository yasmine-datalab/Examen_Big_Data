object ExamenBigData {

  def SelectList(liste : List[String]): List[String]={
    val liste_final = liste.filter(chaine => chaine(chaine.length - 1) == 'n')
    return liste_final
  }
  def liste_double():Unit={
    val domaine : List[List[String]]= List(
                          List("ecommercemag.fr"),
                          List("https://www.journalducm.com/contact/", "Payant"),
                          List("https://www.zatsaz.com/"),
                          List("https://www.lerevenu.com/"),
                          List("https://www.cadre-dirigfdeant-magazine.com/", "Payant"),
                          List("https://www.silicon.fr/Services/contact#annoncer", "Payant"),
                          List("https://www.channelbiz.fr/nous-contacter/"),
                          List("https://www.itespresso.fr/"),
                          List("https://www.industrie-mag.com/article4.html","invité"),
                          List("https://www.jesuisundev.com/article-invite/", "invité"),
                          List("https://www.numerama.com/")  )


    val domaine_1 = domaine.map(liste => {
      if(liste.length == 2){
        List(liste.head.replace("https://www.","").take(liste.head(liste.length)).replace("/",""), liste(1))
      }
      else {
        List(liste.head.replace("https://www.","").take(liste.head(liste.length)).replace("/","") )
      }
    }).foreach(liste => {
      if(liste.length == 2){
        println(liste.head + "\t" + liste(1))
      }
      else {
        println(liste.head)
      }
    })

  }


  def main(args: Array[String]): Unit = {
    //test founction

    SelectList(List("julien", "Paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")).foreach(nom => println(nom+"\t"))

    //test method

    liste_double()
  }
}
