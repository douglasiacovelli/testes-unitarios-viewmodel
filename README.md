# Como fazer testes unitários com ViewModel no Android

Esse repositório é o exemplo usado neste tutorial (https://youtu.be/DPeLiKpZpA8), onde explico como testar o ViewModel no Android.

### Quer baixar o código para fazer junto com o tutorial?
https://github.com/douglasiacovelli/testes-unitarios-viewmodel/tree/antes-testes-unitarios

É só baixar o zip ou clonar o repositório e dar `git checkout antes-testes-unitarios`

### Quer ver apenas o que foi editado no vídeo?
https://github.com/douglasiacovelli/testes-unitarios-viewmodel/pull/1

-----

## Sobre o repositório

São apenas 4 classes do aplicativo:
- ListActivity
- ListAdapter
- ListViewModel
- Repository

E uma de testes:
- ListViewModelTest

O Repository foi feito síncrono por questões de demonstração, assim ele contém apenas um método público: `getData(): List<String>`.
