/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The AccountLimit data type.
 * </p>
 */
public class AccountLimit implements Serializable, Cloneable {

    /**
     * The name of the account limit. Currently, the only account limit is
     * <code>StackLimit</code>.
     */
    private String name;

    /**
     * The value that is associated with the account limit name.
     */
    private Integer value;

    /**
     * The name of the account limit. Currently, the only account limit is
     * <code>StackLimit</code>.
     *
     * @return The name of the account limit. Currently, the only account limit is
     *         <code>StackLimit</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the account limit. Currently, the only account limit is
     * <code>StackLimit</code>.
     *
     * @param name The name of the account limit. Currently, the only account limit is
     *         <code>StackLimit</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the account limit. Currently, the only account limit is
     * <code>StackLimit</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the account limit. Currently, the only account limit is
     *         <code>StackLimit</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccountLimit withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The value that is associated with the account limit name.
     *
     * @return The value that is associated with the account limit name.
     */
    public Integer getValue() {
        return value;
    }
    
    /**
     * The value that is associated with the account limit name.
     *
     * @param value The value that is associated with the account limit name.
     */
    public void setValue(Integer value) {
        this.value = value;
    }
    
    /**
     * The value that is associated with the account limit name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value that is associated with the account limit name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccountLimit withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccountLimit == false) return false;
        AccountLimit other = (AccountLimit)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
    @Override
    public AccountLimit clone() {
        try {
            return (AccountLimit) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    