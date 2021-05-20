object ExamenBigData {

  def SelectList(liste : List[String]): List[String]={
    val liste_final = liste.filter(chaine => chaine(chaine.length - 1) == 'n')
    return liste_final
  }


  def main(args: Array[String]): Unit = {

  }
}
