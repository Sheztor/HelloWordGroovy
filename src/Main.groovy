static void main(String[] args) {
  println "Hello world!"
}

static  void FileIO(){
  def archivo = new File("C:\\Users\\hfsa2\\OneDrive - INTEC\\Trimestres\\T-6\\Tendencias En Desarrollo De Software\\S-1\\GroovyProyect\\HelloWordGroovy\\src\\hola.txt")

  if(archivo.exists()){
    println "El archivo existe."
    // archivo.delete()
  }else{
    archivo.createNewFile()
    println "EL archivo ha sido creado."
  }

  archivo.write("Hola desde Groovy.")

  def contenidoArchivo = archivo.text
  println "El contenido del archivo es: $contenidoArchivo"
}



FileIO()
