// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketWebsiteResponseBuilderOps(val self: GetBucketWebsiteResponse.Builder) extends AnyVal {

  final def withRedirectAllRequestsToAsScala(value: Option[RedirectAllRequestsTo]): GetBucketWebsiteResponse.Builder = {
    value.fold(self) { v =>
      self.redirectAllRequestsTo(v)
    }
  } // RedirectAllRequestsTo

  final def withIndexDocumentAsScala(value: Option[IndexDocument]): GetBucketWebsiteResponse.Builder = {
    value.fold(self) { v =>
      self.indexDocument(v)
    }
  } // IndexDocument

  final def withErrorDocumentAsScala(value: Option[ErrorDocument]): GetBucketWebsiteResponse.Builder = {
    value.fold(self) { v =>
      self.errorDocument(v)
    }
  } // ErrorDocument

  final def withRoutingRulesAsScala(value: Option[Seq[RoutingRule]]): GetBucketWebsiteResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routingRules(v.asJava)
    } // Seq[RoutingRule]
  }

}

final class GetBucketWebsiteResponseOps(val self: GetBucketWebsiteResponse) extends AnyVal {

  final def redirectAllRequestsToAsScala: Option[RedirectAllRequestsTo] =
    Option(self.redirectAllRequestsTo) // RedirectAllRequestsTo

  final def indexDocumentAsScala: Option[IndexDocument] = Option(self.indexDocument) // IndexDocument

  final def errorDocumentAsScala: Option[ErrorDocument] = Option(self.errorDocument) // ErrorDocument

  final def routingRulesAsScala: Option[Seq[RoutingRule]] = Option(self.routingRules).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[RoutingRule]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketWebsiteResponseOps {

  implicit def toGetBucketWebsiteResponseBuilderOps(
      v: GetBucketWebsiteResponse.Builder
  ): GetBucketWebsiteResponseBuilderOps = new GetBucketWebsiteResponseBuilderOps(v)

  implicit def toGetBucketWebsiteResponseOps(v: GetBucketWebsiteResponse): GetBucketWebsiteResponseOps =
    new GetBucketWebsiteResponseOps(v)

}
