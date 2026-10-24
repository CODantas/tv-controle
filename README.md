# Controle da TV

Página do celular para o launcher **TV Premium** (Android TV). Abre apps, controla mídia e volume e manda
recados para a tela.

Esta página não tem segredo nenhum. A TV mostra um QR code com o endereço desta página mais
`#t=<tópico>`: a parte depois do `#` não é enviada ao servidor, fica guardada só no celular
(`localStorage`) e é apagada do endereço. Os comandos vão para a TV pelo [ntfy.sh](https://ntfy.sh).
Para cortar o acesso de todos os celulares, a TV gera um tópico novo.

Ícones: `java ferramentas/Icone.java`.
