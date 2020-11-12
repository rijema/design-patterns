package states;

import ui.Player;

/**
 * Interface em comum para todos os estados
 */
public abstract class State {
    Player player;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     * Contexto passa a si mesmo atraves do estado do construtor, isso pode buscar alguns dados dados de contexto úteis, ajudando o estado.
     */
    
    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}