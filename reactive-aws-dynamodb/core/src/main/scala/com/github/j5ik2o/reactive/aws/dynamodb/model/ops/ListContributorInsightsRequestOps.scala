// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListContributorInsightsRequestBuilderOps(val self: ListContributorInsightsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala(value: Option[String]): ListContributorInsightsRequest.Builder = {
            value.fold(self){ v => self.tableName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): ListContributorInsightsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): ListContributorInsightsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 


}

final class ListContributorInsightsRequestOps(val self: ListContributorInsightsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala: Option[String] = Option(self.tableName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListContributorInsightsRequestOps {

implicit def toListContributorInsightsRequestBuilderOps(v: ListContributorInsightsRequest.Builder): ListContributorInsightsRequestBuilderOps = new ListContributorInsightsRequestBuilderOps(v)

implicit def toListContributorInsightsRequestOps(v: ListContributorInsightsRequest): ListContributorInsightsRequestOps = new ListContributorInsightsRequestOps(v)

}

