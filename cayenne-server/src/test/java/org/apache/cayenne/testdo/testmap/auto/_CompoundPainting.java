package org.apache.cayenne.testdo.testmap.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.testmap.Artist;
import org.apache.cayenne.testdo.testmap.Gallery;
import org.apache.cayenne.testdo.testmap.PaintingInfo;

/**
 * Class _CompoundPainting was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CompoundPainting extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String PAINTING_ID_PK_COLUMN = "PAINTING_ID";

    public static final Property<String> ARTIST_NAME = Property.create("artistName", String.class);
    public static final Property<BigDecimal> ESTIMATED_PRICE = Property.create("estimatedPrice", BigDecimal.class);
    public static final Property<String> GALLERY_NAME = Property.create("galleryName", String.class);
    public static final Property<String> PAINTING_TITLE = Property.create("paintingTitle", String.class);
    public static final Property<String> TEXT_REVIEW = Property.create("textReview", String.class);
    public static final Property<Artist> TO_ARTIST = Property.create("toArtist", Artist.class);
    public static final Property<Gallery> TO_GALLERY = Property.create("toGallery", Gallery.class);
    public static final Property<PaintingInfo> TO_PAINTING_INFO = Property.create("toPaintingInfo", PaintingInfo.class);

    protected String artistName;
    protected BigDecimal estimatedPrice;
    protected String galleryName;
    protected String paintingTitle;
    protected String textReview;

    protected Object toArtist;
    protected Object toGallery;
    protected Object toPaintingInfo;

    public void setArtistName(String artistName) {
        beforePropertyWrite("artistName", this.artistName, artistName);
        this.artistName = artistName;
    }

    public String getArtistName() {
        beforePropertyRead("artistName");
        return this.artistName;
    }

    public void setEstimatedPrice(BigDecimal estimatedPrice) {
        beforePropertyWrite("estimatedPrice", this.estimatedPrice, estimatedPrice);
        this.estimatedPrice = estimatedPrice;
    }

    public BigDecimal getEstimatedPrice() {
        beforePropertyRead("estimatedPrice");
        return this.estimatedPrice;
    }

    public void setGalleryName(String galleryName) {
        beforePropertyWrite("galleryName", this.galleryName, galleryName);
        this.galleryName = galleryName;
    }

    public String getGalleryName() {
        beforePropertyRead("galleryName");
        return this.galleryName;
    }

    public void setPaintingTitle(String paintingTitle) {
        beforePropertyWrite("paintingTitle", this.paintingTitle, paintingTitle);
        this.paintingTitle = paintingTitle;
    }

    public String getPaintingTitle() {
        beforePropertyRead("paintingTitle");
        return this.paintingTitle;
    }

    public void setTextReview(String textReview) {
        beforePropertyWrite("textReview", this.textReview, textReview);
        this.textReview = textReview;
    }

    public String getTextReview() {
        beforePropertyRead("textReview");
        return this.textReview;
    }

    public void setToArtist(Artist toArtist) {
        setToOneTarget("toArtist", toArtist, true);
    }

    public Artist getToArtist() {
        return (Artist)readProperty("toArtist");
    }

    public void setToGallery(Gallery toGallery) {
        setToOneTarget("toGallery", toGallery, true);
    }

    public Gallery getToGallery() {
        return (Gallery)readProperty("toGallery");
    }

    public void setToPaintingInfo(PaintingInfo toPaintingInfo) {
        setToOneTarget("toPaintingInfo", toPaintingInfo, true);
    }

    public PaintingInfo getToPaintingInfo() {
        return (PaintingInfo)readProperty("toPaintingInfo");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "artistName":
                return this.artistName;
            case "estimatedPrice":
                return this.estimatedPrice;
            case "galleryName":
                return this.galleryName;
            case "paintingTitle":
                return this.paintingTitle;
            case "textReview":
                return this.textReview;
            case "toArtist":
                return this.toArtist;
            case "toGallery":
                return this.toGallery;
            case "toPaintingInfo":
                return this.toPaintingInfo;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "artistName":
                this.artistName = (String)val;
                break;
            case "estimatedPrice":
                this.estimatedPrice = (BigDecimal)val;
                break;
            case "galleryName":
                this.galleryName = (String)val;
                break;
            case "paintingTitle":
                this.paintingTitle = (String)val;
                break;
            case "textReview":
                this.textReview = (String)val;
                break;
            case "toArtist":
                this.toArtist = val;
                break;
            case "toGallery":
                this.toGallery = val;
                break;
            case "toPaintingInfo":
                this.toPaintingInfo = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.artistName);
        out.writeObject(this.estimatedPrice);
        out.writeObject(this.galleryName);
        out.writeObject(this.paintingTitle);
        out.writeObject(this.textReview);
        out.writeObject(this.toArtist);
        out.writeObject(this.toGallery);
        out.writeObject(this.toPaintingInfo);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.artistName = (String)in.readObject();
        this.estimatedPrice = (BigDecimal)in.readObject();
        this.galleryName = (String)in.readObject();
        this.paintingTitle = (String)in.readObject();
        this.textReview = (String)in.readObject();
        this.toArtist = in.readObject();
        this.toGallery = in.readObject();
        this.toPaintingInfo = in.readObject();
    }

}
