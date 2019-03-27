// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue => ScalaAttributeValue, _ }
import software.amazon.awssdk.services.dynamodb.model.{ AttributeValue => JavaAttributeValue }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeValueOps {

  implicit class ScalaAttributeValueOps(val self: ScalaAttributeValue) extends AnyVal {

    def toJava: JavaAttributeValue = {
      val result = JavaAttributeValue.builder()
      self.s.filter(_.nonEmpty).foreach(v => result.s(v)) // String
      self.n.filter(_.nonEmpty).foreach(v => result.n(v)) // String
      self.b
        .filter(_.nonEmpty).foreach(v => result.b(software.amazon.awssdk.core.SdkBytes.fromByteArray(v))) // SdkBytes
      self.ss.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.ss(v.asJava)
      } // Seq[String]
      self.ns.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.ns(v.asJava)
      } // Seq[String]
      self.bs.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._;
        result.bs(v.map(software.amazon.awssdk.core.SdkBytes.fromByteArray).asJava)
      } // Seq[SdkBytes]
      self.m.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.m(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.l.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.l(v.map(_.toJava).asJava)
      } // Seq[AttributeValue]
      self.bool.map(_.booleanValue).foreach(v => result.bool(v)) // Boolean
      self.nul.map(_.booleanValue).foreach(v => result.nul(v))   // Boolean

      result.build()
    }

  }

  implicit class JavaAttributeValueOps(val self: JavaAttributeValue) extends AnyVal {

    def toScala: ScalaAttributeValue = {
      ScalaAttributeValue()
        .withS(Option(self.s)) // String
        .withN(Option(self.n)) // String
        .withB(Option(self.b).map(_.asByteArray())) // SdkBytes
        .withSs(Option(self.ss).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withNs(Option(self.ns).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withBs(Option(self.bs).map { v =>
          import scala.collection.JavaConverters._; v.asScala.map(_.asByteArray())
        }) // Seq[SdkBytes]
        .withM(Option(self.m).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withL(Option(self.l).map { v =>
          import scala.collection.JavaConverters._; v.asScala.map(_.toScala)
        }) // Seq[AttributeValue]
        .withBool(Option(self.bool).map(_.booleanValue)) // Boolean
        .withNul(Option(self.nul).map(_.booleanValue)) // Boolean
    }

  }

}
