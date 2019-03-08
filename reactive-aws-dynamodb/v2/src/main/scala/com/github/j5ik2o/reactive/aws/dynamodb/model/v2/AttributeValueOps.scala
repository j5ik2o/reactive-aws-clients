package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue => ScalaAttributeValue }
import software.amazon.awssdk.core.SdkBytes
import software.amazon.awssdk.services.dynamodb.model.{ AttributeValue => JavaAttributeValue }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeValueOps {

  implicit class JavaAttributeValueOps(val self: JavaAttributeValue) extends AnyVal {

    def toScala: ScalaAttributeValue = {
      ScalaAttributeValue()
        .withS(Option(self.s()))
        .withN(Option(self.n()))
        .withB(Option(self.b()).map(_.asByteArray()))
        .withSs(Option(self.ss()).map(_.asScala))
        .withNs(Option(self.ns()).map(_.asScala))
        .withBs(Option(self.bs).map(_.asScala.map(_.asByteArray())))
        .withM(Option(self.m()).map(_.asScala.toMap.mapValues(_.toScala)))
        .withL(Option(self.l()).map(_.asScala.toList.map(_.toScala)))
        .withNul(Option(self.nul()).map(_.booleanValue()))
        .withBool(Option(self.bool()).map(_.booleanValue))
    }

  }

  implicit class AttributeValueOps(val self: ScalaAttributeValue) extends AnyVal {

    def toJava: JavaAttributeValue = {
      val result = JavaAttributeValue.builder()
      self.s.foreach(v => if (v.nonEmpty) result.s(v))
      self.n.foreach(v => if (v.nonEmpty) result.n(v))
      self.b.foreach(v => if (v.nonEmpty) result.b(SdkBytes.fromByteArray(v)))
      self.ss.foreach(v => if (v.nonEmpty) result.ss(v.asJava))
      self.ns.foreach(v => if (v.nonEmpty) result.ns(v.asJava))
      self.bs.foreach(v => if (v.nonEmpty) result.bs(v.map(v => SdkBytes.fromByteArray(v)).asJava))
      self.m.foreach(v => if (v.nonEmpty) result.m(v.mapValues(_.toJava).asJava))
      self.l.foreach(v => if (v.nonEmpty) result.l(v.map(_.toJava).asJava))
      self.nul.foreach(v => result.nul(v))
      self.bool.foreach(v => result.bool(v))
      result.build()
    }

  }
}
