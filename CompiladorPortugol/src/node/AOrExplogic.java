/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AOrExplogic extends PExplogic
{
    private PExp _exp_;
    private TOu _ou_;
    private PTermlogic _termlogic_;

    public AOrExplogic()
    {
        // Constructor
    }

    public AOrExplogic(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TOu _ou_,
        @SuppressWarnings("hiding") PTermlogic _termlogic_)
    {
        // Constructor
        setExp(_exp_);

        setOu(_ou_);

        setTermlogic(_termlogic_);

    }

    @Override
    public Object clone()
    {
        return new AOrExplogic(
            cloneNode(this._exp_),
            cloneNode(this._ou_),
            cloneNode(this._termlogic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrExplogic(this);
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

    public TOu getOu()
    {
        return this._ou_;
    }

    public void setOu(TOu node)
    {
        if(this._ou_ != null)
        {
            this._ou_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ou_ = node;
    }

    public PTermlogic getTermlogic()
    {
        return this._termlogic_;
    }

    public void setTermlogic(PTermlogic node)
    {
        if(this._termlogic_ != null)
        {
            this._termlogic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termlogic_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._ou_)
            + toString(this._termlogic_);
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

        if(this._ou_ == child)
        {
            this._ou_ = null;
            return;
        }

        if(this._termlogic_ == child)
        {
            this._termlogic_ = null;
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

        if(this._ou_ == oldChild)
        {
            setOu((TOu) newChild);
            return;
        }

        if(this._termlogic_ == oldChild)
        {
            setTermlogic((PTermlogic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
