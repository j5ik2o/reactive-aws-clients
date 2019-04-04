// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CORSRuleBuilderOps(val self: CORSRule.Builder) extends AnyVal {

  final def withAllowedHeadersAsScala(value: Option[Seq[String]]): CORSRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.allowedHeaders(v.asJava)
    } // Seq[String]
  }

  final def withAllowedMethodsAsScala(value: Option[Seq[String]]): CORSRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.allowedMethods(v.asJava)
    } // Seq[String]
  }

  final def withAllowedOriginsAsScala(value: Option[Seq[String]]): CORSRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.allowedOrigins(v.asJava)
    } // Seq[String]
  }

  final def withExposeHeadersAsScala(value: Option[Seq[String]]): CORSRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.exposeHeaders(v.asJava)
    } // Seq[String]
  }

  final def withMaxAgeSecondsAsScala(value: Option[Int]): CORSRule.Builder = {
    value.fold(self) { v =>
      self.maxAgeSeconds(v)
    }
  } // Int

}

final class CORSRuleOps(val self: CORSRule) extends AnyVal {

  final def allowedHeadersAsScala: Option[Seq[String]] = Option(self.allowedHeaders).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def allowedMethodsAsScala: Option[Seq[String]] = Option(self.allowedMethods).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def allowedOriginsAsScala: Option[Seq[String]] = Option(self.allowedOrigins).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def exposeHeadersAsScala: Option[Seq[String]] = Option(self.exposeHeaders).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def maxAgeSecondsAsScala: Option[Int] = Option(self.maxAgeSeconds) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCORSRuleOps {

  implicit def toCORSRuleBuilderOps(v: CORSRule.Builder): CORSRuleBuilderOps = new CORSRuleBuilderOps(v)

  implicit def toCORSRuleOps(v: CORSRule): CORSRuleOps = new CORSRuleOps(v)

}
