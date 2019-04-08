// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class WebsiteConfigurationBuilderOps(val self: WebsiteConfiguration.Builder) extends AnyVal {

  final def errorDocumentAsScala(value: Option[ErrorDocument]): WebsiteConfiguration.Builder = {
    value.fold(self) { v =>
      self.errorDocument(v)
    }
  } // ErrorDocument

  final def indexDocumentAsScala(value: Option[IndexDocument]): WebsiteConfiguration.Builder = {
    value.fold(self) { v =>
      self.indexDocument(v)
    }
  } // IndexDocument

  final def redirectAllRequestsToAsScala(value: Option[RedirectAllRequestsTo]): WebsiteConfiguration.Builder = {
    value.fold(self) { v =>
      self.redirectAllRequestsTo(v)
    }
  } // RedirectAllRequestsTo

  final def routingRulesAsScala(value: Option[Seq[RoutingRule]]): WebsiteConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routingRules(v.asJava)
    } // Seq[RoutingRule]
  }

}

final class WebsiteConfigurationOps(val self: WebsiteConfiguration) extends AnyVal {

  final def errorDocumentAsScala: Option[ErrorDocument] = Option(self.errorDocument) // ErrorDocument

  final def indexDocumentAsScala: Option[IndexDocument] = Option(self.indexDocument) // IndexDocument

  final def redirectAllRequestsToAsScala: Option[RedirectAllRequestsTo] =
    Option(self.redirectAllRequestsTo) // RedirectAllRequestsTo

  final def routingRulesAsScala: Option[Seq[RoutingRule]] = Option(self.routingRules).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[RoutingRule]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToWebsiteConfigurationOps {

  implicit def toWebsiteConfigurationBuilderOps(v: WebsiteConfiguration.Builder): WebsiteConfigurationBuilderOps =
    new WebsiteConfigurationBuilderOps(v)

  implicit def toWebsiteConfigurationOps(v: WebsiteConfiguration): WebsiteConfigurationOps =
    new WebsiteConfigurationOps(v)

}
