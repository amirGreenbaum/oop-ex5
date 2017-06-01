/**
 * A class representing a section. each section consist of two sub-section: filter and order
 * this class return the
 */
public class Section {
    private String filter;
    private String order;

    public Section(String typeFilter, String typeOrder){
        filter = typeFilter;
        order = typeOrder;
    }
    /**
     *
     * @return gets the name of  the filter of the section
     */
    public String getFilter() {
        return filter;
    }
    /**
     *
     * @return gets the name of the order of the section
     */
    public String getOrder() {
        return order;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
