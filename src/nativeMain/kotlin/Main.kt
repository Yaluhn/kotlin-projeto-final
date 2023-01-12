enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val idade: Int, val id: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val nivelDificuldade: Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }

    fun usuarioEstaInscrito(usuario: Usuario): Boolean {
        return usuario in inscritos
    }

}

fun main() {
    //  TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    val usuario1 = Usuario("Jonas", 36 , 121)
    val usuario2 = Usuario("Tatiana", 19 , 122)
    val usuario3 = Usuario("Lucas", 25 , 123)
    val usuario4 = Usuario("Teth", 25, 123)

    //  TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudo1 = ConteudoEducacional("Introdução à programação", 60, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Estruturas de dados", 90, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Algoritmos de ordenação", 45, Nivel.AVANCADO)

    val formacao1 = Formacao(conteudo2.nome, conteudo2.nivel, listOf(conteudo1, conteudo2, conteudo3))

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.matricular(usuario3)


    /*
    println(formacao1.usuarioEstaInscrito(usuario1))
    println(formacao1.usuarioEstaInscrito(usuario2))
    println(formacao1.usuarioEstaInscrito(usuario3))
    println(formacao1.usuarioEstaInscrito(usuario4))
    */

    println("Usuários inscritos no curso de ${formacao1.nome} (${formacao1.nivelDificuldade}): ${formacao1.inscritos}")
    // TODO("tentar acessar o construtor de Usuario.nome para imprimir somente os usuarios finais")
}
