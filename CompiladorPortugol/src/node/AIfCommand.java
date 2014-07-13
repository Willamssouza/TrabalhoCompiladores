/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AIfCommand extends PCommand
{
    private PExp _exp_;
    private final LinkedList<PCommand> _then_ = new LinkedList<PCommand>();
    private final LinkedList<PCommand> _else_ = new LinkedList<PCommand>();

    public AIfCommand()
    {
        // Constructor
    }

    public AIfCommand(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") List<?> _then_,
        @SuppressWarnings("hiding") List<?> _else_)
    {
        // Constructor
        setExp(_exp_);

        setThen(_then_);

        setElse(_else_);

    }

    @Override
    public Object clone()
    {
        return new AIfCommand(
            cloneNode(this._exp_),
            cloneList(this._then_),
            cloneList(this._else_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfCommand(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public LinkedList<PCommand> getThen()
    {
        return this._then_;
    }

    public void setThen(List<?> list)
    {
        for(PCommand e : this._then_)
        {
            e.parent(null);
        }
        this._then_.clear();

        for(Object obj_e : list)
        {
            PCommand e = (PCommand) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._then_.add(e);
        }
    }

    public LinkedList<PCommand> getElse()
    {
        return this._else_;
    }

    public void setElse(List<?> list)
    {
        for(PCommand e : this._else_)
        {
            e.parent(null);
        }
        this._else_.clear();

        for(Object obj_e : list)
        {
            PCommand e = (PCommand) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._else_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._then_)
            + toString(this._else_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._then_.remove(child))
        {
            return;
        }

        if(this._else_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        for(ListIterator<PCommand> i = this._then_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCommand) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PCommand> i = this._else_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCommand) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
