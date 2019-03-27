// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue => ScalaAttributeValue, _ }
import com.amazonaws.services.dynamodbv2.model.{ AttributeValue => JavaAttributeValue }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeValueOps {

  implicit class ScalaAttributeValueOps(val self: ScalaAttributeValue) extends AnyVal {

    def toJava: JavaAttributeValue = {
      val result = new JavaAttributeValue()
      self.s.filter(_.nonEmpty).foreach(v => result.withS(v))                           // String
      self.n.filter(_.nonEmpty).foreach(v => result.withN(v))                           // String
      self.b.filter(_.nonEmpty).foreach(v => result.withB(java.nio.ByteBuffer.wrap(v))) // SdkBytes
      self.ss.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withSS(v.asJava)
      } // Seq[String]
      self.ns.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withNS(v.asJava)
      } // Seq[String]
      self.bs.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withBS(v.map(java.nio.ByteBuffer.wrap).asJava)
      } // Seq[SdkBytes]
      self.m.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withM(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.l.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withL(v.map(_.toJava).asJava)
      } // Seq[AttributeValue]
      self.bool.map(_.booleanValue).foreach(v => result.withBOOL(v)) // Boolean
      self.nul.map(_.booleanValue).foreach(v => result.withNULL(v))  // Boolean

      result
    }

  }

  implicit class JavaAttributeValueOps(val self: JavaAttributeValue) extends AnyVal {

    def toScala: ScalaAttributeValue = {
      ScalaAttributeValue()
        .withS(Option(self.getS)) // String
        .withN(Option(self.getN)) // String
        .withB(Option(self.getB).map(_.array())) // SdkBytes
        .withSs(Option(self.getSS).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withNs(Option(self.getNS).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
        .withBs(Option(self.getBS).map { v =>
          import scala.collection.JavaConverters._; v.asScala.map(_.array())
        }) // Seq[SdkBytes]
        .withM(Option(self.getM).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withL(Option(self.getL).map { v =>
          import scala.collection.JavaConverters._; v.asScala.map(_.toScala)
        }) // Seq[AttributeValue]
        .withBool(Option(self.getBOOL).map(_.booleanValue)) // Boolean
        .withNul(Option(self.getNULL).map(_.booleanValue)) // Boolean
    }

  }

}
