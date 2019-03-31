// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ CORSRule => ScalaCORSRule, _ }
import software.amazon.awssdk.services.s3.model.{ CORSRule => JavaCORSRule }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CORSRuleOps {

  implicit class ScalaCORSRuleOps(val self: ScalaCORSRule) extends AnyVal {

    def toJava: JavaCORSRule = {
      val result = JavaCORSRule.builder()
      self.allowedHeaders.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.allowedHeaders(v.asJava)
      } // Seq[String]
      self.allowedMethods.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.allowedMethods(v.asJava)
      } // Seq[String]
      self.allowedOrigins.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.allowedOrigins(v.asJava)
      } // Seq[String]
      self.exposeHeaders.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.exposeHeaders(v.asJava)
      } // Seq[String]
      self.maxAgeSeconds.map(_.intValue).foreach(v => result.maxAgeSeconds(v)) // Int

      result.build()
    }

  }

  implicit class JavaCORSRuleOps(val self: JavaCORSRule) extends AnyVal {

    def toScala: ScalaCORSRule = {
      ScalaCORSRule()
        .withAllowedHeaders(Option(self.allowedHeaders).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withAllowedMethods(Option(self.allowedMethods).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withAllowedOrigins(Option(self.allowedOrigins).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withExposeHeaders(Option(self.exposeHeaders).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withMaxAgeSeconds(Option(self.maxAgeSeconds).map(_.intValue)) // Int
    }

  }

}
