// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ WebsiteConfiguration => ScalaWebsiteConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ WebsiteConfiguration => JavaWebsiteConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object WebsiteConfigurationOps {

  implicit class ScalaWebsiteConfigurationOps(val self: ScalaWebsiteConfiguration) extends AnyVal {

    def toJava: JavaWebsiteConfiguration = {
      val result = JavaWebsiteConfiguration.builder()
      self.errorDocument.foreach { v =>
        import ErrorDocumentOps._; result.errorDocument(v.toJava)
      } // ErrorDocument
      self.indexDocument.foreach { v =>
        import IndexDocumentOps._; result.indexDocument(v.toJava)
      } // IndexDocument
      self.redirectAllRequestsTo.foreach { v =>
        import RedirectAllRequestsToOps._; result.redirectAllRequestsTo(v.toJava)
      } // RedirectAllRequestsTo
      self.routingRules.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, RoutingRuleOps._; result.routingRules(v.map(_.toJava).asJava)
      } // Seq[RoutingRule]

      result.build()
    }

  }

  implicit class JavaWebsiteConfigurationOps(val self: JavaWebsiteConfiguration) extends AnyVal {

    def toScala: ScalaWebsiteConfiguration = {
      ScalaWebsiteConfiguration()
        .withErrorDocument(Option(self.errorDocument).map { v =>
          import ErrorDocumentOps._; v.toScala
        }) // ErrorDocument
        .withIndexDocument(Option(self.indexDocument).map { v =>
          import IndexDocumentOps._; v.toScala
        }) // IndexDocument
        .withRedirectAllRequestsTo(Option(self.redirectAllRequestsTo).map { v =>
          import RedirectAllRequestsToOps._; v.toScala
        }) // RedirectAllRequestsTo
        .withRoutingRules(Option(self.routingRules).map { v =>
          import scala.collection.JavaConverters._, RoutingRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[RoutingRule]
    }

  }

}
