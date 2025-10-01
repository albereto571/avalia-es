<!doctype html>
<html lang="pt-BR">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Carros Esportivos</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <header>
    <h1>Carros Esportivos</h1>
    <nav>
      <a href="#sobre">Sobre</a>
      <a href="#galeria">Galeria</a>
      <a href="#contato">Contato</a>
    </nav>
  </header>

  <main>
    <section id="sobre">
      <h2>Tesla Model S</h2>
      <p>
        O Tesla Model S é um carro elétrico de alto desempenho que combina velocidade,
        tecnologia de ponta e design futurista. Ele pode acelerar de 0 a 100 km/h em poucos segundos,
        oferecendo uma experiência única ao volante.
      </p>
      <img src="https://picsum.photos/800/400?car=1" alt="Tesla Model S">
    </section>

    <section id="galeria">
      <h2>Galeria</h2>
      <div class="galeria">
        <img src="https://picsum.photos/400/250?car=2" alt="Carro esportivo lateral">
        <img src="https://picsum.photos/400/250?car=3" alt="Interior luxuoso do carro">
        <img src="https://picsum.photos/400/250?car=4" alt="Carro visto de trás">
      </div>
    </section>
  </main>

  <footer id="contato">
    <p>© 2025 Carros Esportivos — Todos os direitos reservados.</p>
  </footer>
</body>
</html>body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
  text-align: center;
  background: #f4f4f4;
  color: #222;
}

header {
  background: #111;
  color: #fff;
  padding: 1rem;
}

header h1 {
  margin: 0;
}

nav {
  margin-top: 0.5rem;
}

nav a {
  color: #fff;
  margin: 0 10px;
  text-decoration: none;
  font-weight: bold;
}

nav a:hover {
  color: #ff0000;
}

main {
  padding: 2rem;
}

h2 {
  margin-top: 1rem;
  color: #b00;
}

img {
  max-width: 100%;
  border-radius: 8px;
  margin-top: 1rem;
}

.galeria {
  display: flex;
  justify-content: center;
  gap: 1rem;
  flex-wrap: wrap;
  margin-top: 1rem;
}

.galeria img {
  width: 300px;
  height: 200px;
  object-fit: cover;
  border-radius: 8px;
  box-shadow: 0 4px 10px rgba(0,0,0,0.3);
}

footer {
  margin-top: 2rem;
  background: #111;
  color: #fff;
  padding: 1rem;
}
