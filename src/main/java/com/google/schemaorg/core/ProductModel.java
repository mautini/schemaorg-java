/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.schemaorg.core;

import com.google.common.collect.ImmutableList;
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/ProductModel">http://schema.org/ProductModel</a>. */
public interface ProductModel extends Product {

  /**
   * Builder interface of <a
   * href="http://schema.org/ProductModel">http://schema.org/ProductModel</a>.
   */
  public interface Builder extends Product.Builder {

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext context);

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext.Builder context);

    @Override
    Builder setJsonLdId(@Nullable String value);

    @Override
    Builder setJsonLdReverse(String property, Thing obj);

    @Override
    Builder setJsonLdReverse(String property, Thing.Builder builder);

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(PropertyValue value);

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(PropertyValue.Builder value);

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(AggregateRating value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(AggregateRating.Builder value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property audience. */
    Builder addAudience(Audience value);

    /** Add a value to property audience. */
    Builder addAudience(Audience.Builder value);

    /** Add a value to property audience. */
    Builder addAudience(String value);

    /** Add a value to property award. */
    Builder addAward(Text value);

    /** Add a value to property award. */
    Builder addAward(String value);

    /** Add a value to property awards. */
    Builder addAwards(Text value);

    /** Add a value to property awards. */
    Builder addAwards(String value);

    /** Add a value to property brand. */
    Builder addBrand(Brand value);

    /** Add a value to property brand. */
    Builder addBrand(Brand.Builder value);

    /** Add a value to property brand. */
    Builder addBrand(Organization value);

    /** Add a value to property brand. */
    Builder addBrand(Organization.Builder value);

    /** Add a value to property brand. */
    Builder addBrand(String value);

    /** Add a value to property category. */
    Builder addCategory(PhysicalActivityCategory value);

    /** Add a value to property category. */
    Builder addCategory(Text value);

    /** Add a value to property category. */
    Builder addCategory(Thing value);

    /** Add a value to property category. */
    Builder addCategory(Thing.Builder value);

    /** Add a value to property category. */
    Builder addCategory(String value);

    /** Add a value to property color. */
    Builder addColor(Text value);

    /** Add a value to property color. */
    Builder addColor(String value);

    /** Add a value to property depth. */
    Builder addDepth(Distance value);

    /** Add a value to property depth. */
    Builder addDepth(Distance.Builder value);

    /** Add a value to property depth. */
    Builder addDepth(QuantitativeValue value);

    /** Add a value to property depth. */
    Builder addDepth(QuantitativeValue.Builder value);

    /** Add a value to property depth. */
    Builder addDepth(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property gtin12. */
    Builder addGtin12(Text value);

    /** Add a value to property gtin12. */
    Builder addGtin12(String value);

    /** Add a value to property gtin13. */
    Builder addGtin13(Text value);

    /** Add a value to property gtin13. */
    Builder addGtin13(String value);

    /** Add a value to property gtin14. */
    Builder addGtin14(Text value);

    /** Add a value to property gtin14. */
    Builder addGtin14(String value);

    /** Add a value to property gtin8. */
    Builder addGtin8(Text value);

    /** Add a value to property gtin8. */
    Builder addGtin8(String value);

    /** Add a value to property height. */
    Builder addHeight(Distance value);

    /** Add a value to property height. */
    Builder addHeight(Distance.Builder value);

    /** Add a value to property height. */
    Builder addHeight(QuantitativeValue value);

    /** Add a value to property height. */
    Builder addHeight(QuantitativeValue.Builder value);

    /** Add a value to property height. */
    Builder addHeight(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property isAccessoryOrSparePartFor. */
    Builder addIsAccessoryOrSparePartFor(Product value);

    /** Add a value to property isAccessoryOrSparePartFor. */
    Builder addIsAccessoryOrSparePartFor(Product.Builder value);

    /** Add a value to property isAccessoryOrSparePartFor. */
    Builder addIsAccessoryOrSparePartFor(String value);

    /** Add a value to property isConsumableFor. */
    Builder addIsConsumableFor(Product value);

    /** Add a value to property isConsumableFor. */
    Builder addIsConsumableFor(Product.Builder value);

    /** Add a value to property isConsumableFor. */
    Builder addIsConsumableFor(String value);

    /** Add a value to property isRelatedTo. */
    Builder addIsRelatedTo(Product value);

    /** Add a value to property isRelatedTo. */
    Builder addIsRelatedTo(Product.Builder value);

    /** Add a value to property isRelatedTo. */
    Builder addIsRelatedTo(String value);

    /** Add a value to property isSimilarTo. */
    Builder addIsSimilarTo(Product value);

    /** Add a value to property isSimilarTo. */
    Builder addIsSimilarTo(Product.Builder value);

    /** Add a value to property isSimilarTo. */
    Builder addIsSimilarTo(String value);

    /** Add a value to property isVariantOf. */
    Builder addIsVariantOf(ProductModel value);

    /** Add a value to property isVariantOf. */
    Builder addIsVariantOf(ProductModel.Builder value);

    /** Add a value to property isVariantOf. */
    Builder addIsVariantOf(String value);

    /** Add a value to property itemCondition. */
    Builder addItemCondition(OfferItemCondition value);

    /** Add a value to property itemCondition. */
    Builder addItemCondition(String value);

    /** Add a value to property logo. */
    Builder addLogo(ImageObject value);

    /** Add a value to property logo. */
    Builder addLogo(ImageObject.Builder value);

    /** Add a value to property logo. */
    Builder addLogo(URL value);

    /** Add a value to property logo. */
    Builder addLogo(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property manufacturer. */
    Builder addManufacturer(Organization value);

    /** Add a value to property manufacturer. */
    Builder addManufacturer(Organization.Builder value);

    /** Add a value to property manufacturer. */
    Builder addManufacturer(String value);

    /** Add a value to property model. */
    Builder addModel(ProductModel value);

    /** Add a value to property model. */
    Builder addModel(ProductModel.Builder value);

    /** Add a value to property model. */
    Builder addModel(Text value);

    /** Add a value to property model. */
    Builder addModel(String value);

    /** Add a value to property mpn. */
    Builder addMpn(Text value);

    /** Add a value to property mpn. */
    Builder addMpn(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property offers. */
    Builder addOffers(Offer value);

    /** Add a value to property offers. */
    Builder addOffers(Offer.Builder value);

    /** Add a value to property offers. */
    Builder addOffers(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property predecessorOf. */
    Builder addPredecessorOf(ProductModel value);

    /** Add a value to property predecessorOf. */
    Builder addPredecessorOf(ProductModel.Builder value);

    /** Add a value to property predecessorOf. */
    Builder addPredecessorOf(String value);

    /** Add a value to property productID. */
    Builder addProductID(Text value);

    /** Add a value to property productID. */
    Builder addProductID(String value);

    /** Add a value to property productionDate. */
    Builder addProductionDate(Date value);

    /** Add a value to property productionDate. */
    Builder addProductionDate(String value);

    /** Add a value to property purchaseDate. */
    Builder addPurchaseDate(Date value);

    /** Add a value to property purchaseDate. */
    Builder addPurchaseDate(String value);

    /** Add a value to property releaseDate. */
    Builder addReleaseDate(Date value);

    /** Add a value to property releaseDate. */
    Builder addReleaseDate(String value);

    /** Add a value to property review. */
    Builder addReview(Review value);

    /** Add a value to property review. */
    Builder addReview(Review.Builder value);

    /** Add a value to property review. */
    Builder addReview(String value);

    /** Add a value to property reviews. */
    Builder addReviews(Review value);

    /** Add a value to property reviews. */
    Builder addReviews(Review.Builder value);

    /** Add a value to property reviews. */
    Builder addReviews(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property sku. */
    Builder addSku(Text value);

    /** Add a value to property sku. */
    Builder addSku(String value);

    /** Add a value to property successorOf. */
    Builder addSuccessorOf(ProductModel value);

    /** Add a value to property successorOf. */
    Builder addSuccessorOf(ProductModel.Builder value);

    /** Add a value to property successorOf. */
    Builder addSuccessorOf(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property weight. */
    Builder addWeight(QuantitativeValue value);

    /** Add a value to property weight. */
    Builder addWeight(QuantitativeValue.Builder value);

    /** Add a value to property weight. */
    Builder addWeight(String value);

    /** Add a value to property width. */
    Builder addWidth(Distance value);

    /** Add a value to property width. */
    Builder addWidth(Distance.Builder value);

    /** Add a value to property width. */
    Builder addWidth(QuantitativeValue value);

    /** Add a value to property width. */
    Builder addWidth(QuantitativeValue.Builder value);

    /** Add a value to property width. */
    Builder addWidth(String value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article.Builder value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(String value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification.Builder value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(String value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The value of the property.
     */
    Builder addProperty(String name, SchemaOrgType value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param builder The schema.org object builder for the property value.
     */
    Builder addProperty(String name, Thing.Builder builder);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The string value of the property.
     */
    Builder addProperty(String name, String value);

    /** Build a {@link ProductModel} object. */
    ProductModel build();
  }

  /**
   * Returns the value list of property isVariantOf. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getIsVariantOfList();

  /**
   * Returns the value list of property predecessorOf. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPredecessorOfList();

  /**
   * Returns the value list of property successorOf. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getSuccessorOfList();
}
