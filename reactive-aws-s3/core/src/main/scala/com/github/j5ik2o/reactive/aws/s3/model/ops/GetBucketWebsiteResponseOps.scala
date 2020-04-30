// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketWebsiteResponseBuilderOps(val self: GetBucketWebsiteResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def redirectAllRequestsToAsScala(value: Option[RedirectAllRequestsTo]): GetBucketWebsiteResponse.Builder = {
            value.fold(self){ v => self.redirectAllRequestsTo(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def indexDocumentAsScala(value: Option[IndexDocument]): GetBucketWebsiteResponse.Builder = {
            value.fold(self){ v => self.indexDocument(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorDocumentAsScala(value: Option[ErrorDocument]): GetBucketWebsiteResponse.Builder = {
            value.fold(self){ v => self.errorDocument(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routingRulesAsScala(value: Option[Seq[RoutingRule]]): GetBucketWebsiteResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.routingRules(v.asJava) } 
            }


}

final class GetBucketWebsiteResponseOps(val self: GetBucketWebsiteResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def redirectAllRequestsToAsScala: Option[RedirectAllRequestsTo] = Option(self.redirectAllRequestsTo) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def indexDocumentAsScala: Option[IndexDocument] = Option(self.indexDocument) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorDocumentAsScala: Option[ErrorDocument] = Option(self.errorDocument) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def routingRulesAsScala: Option[Seq[RoutingRule]] = Option(self.routingRules).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketWebsiteResponseOps {

implicit def toGetBucketWebsiteResponseBuilderOps(v: GetBucketWebsiteResponse.Builder): GetBucketWebsiteResponseBuilderOps = new GetBucketWebsiteResponseBuilderOps(v)

implicit def toGetBucketWebsiteResponseOps(v: GetBucketWebsiteResponse): GetBucketWebsiteResponseOps = new GetBucketWebsiteResponseOps(v)

}

