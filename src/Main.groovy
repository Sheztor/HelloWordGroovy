static void main(String[] args) {
  println "Hello world!"

  //FileIO()
  //standardStreams()
  //variablesAmbiente()

  println("Argumento en el index 1: "+args[1])
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

static void standardStreams(){
  def Reader = new BufferedReader(new InputStreamReader(System.in))

  println "Ingresa tu nombre: "

  def nombre = Reader.readLine()

  println "Hola $nombre"

  System.out.println("Hola desde otro lugar $nombre")
  System.err.println("Esto es un error")
}

static void variablesAmbiente(){
  println("*** Creando variable de ambiente ***")
  System.setProperty("EL_AMBIENTE", "TEND. DE SOFTWARE")
  println("La variable EL_AMBIENTE = ${System.getProperty('EL_AMBIENTE')} \n")

  println("*** Eliminando variable de ambiente ***")
  System.clearProperty("EL_AMBIENTE")
  println("La variable EL_AMBIENTE = ${System.getProperty('EL_AMBIENTE')} \n")


  println("*** Buscando una variable de ambiente, de una manera diferente ***")
  def PATH = System.env['Path']
  println("El Path es: $PATH \n")

  println("*** Listando todas las variables de ambiente ***")
  System.env.each{ key, value -> println("${key} = ${value}")}
}

