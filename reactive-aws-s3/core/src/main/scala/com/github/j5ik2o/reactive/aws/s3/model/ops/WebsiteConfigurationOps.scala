// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class WebsiteConfigurationBuilderOps(val self: WebsiteConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorDocumentAsScala(value: Option[ErrorDocument]): WebsiteConfiguration.Builder = {
    value.fold(self) { v => self.errorDocument(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexDocumentAsScala(value: Option[IndexDocument]): WebsiteConfiguration.Builder = {
    value.fold(self) { v => self.indexDocument(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def redirectAllRequestsToAsScala(value: Option[RedirectAllRequestsTo]): WebsiteConfiguration.Builder = {
    value.fold(self) { v => self.redirectAllRequestsTo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routingRulesAsScala(value: Option[Seq[RoutingRule]]): WebsiteConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.routingRules(v.asJava)
    }
  }

}

final class WebsiteConfigurationOps(val self: WebsiteConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorDocumentAsScala: Option[ErrorDocument] = Option(self.errorDocument)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexDocumentAsScala: Option[IndexDocument] = Option(self.indexDocument)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def redirectAllRequestsToAsScala: Option[RedirectAllRequestsTo] = Option(self.redirectAllRequestsTo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routingRulesAsScala: Option[Seq[RoutingRule]] =
    Option(self.routingRules).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToWebsiteConfigurationOps {

  implicit def toWebsiteConfigurationBuilderOps(v: WebsiteConfiguration.Builder): WebsiteConfigurationBuilderOps =
    new WebsiteConfigurationBuilderOps(v)

  implicit def toWebsiteConfigurationOps(v: WebsiteConfiguration): WebsiteConfigurationOps =
    new WebsiteConfigurationOps(v)

}
