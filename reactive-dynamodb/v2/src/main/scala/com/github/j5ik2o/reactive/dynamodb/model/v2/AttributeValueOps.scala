package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ AttributeValue => ScalaAttributeValue }
import software.amazon.awssdk.core.SdkBytes
import software.amazon.awssdk.services.dynamodb.model.{ AttributeValue => JavaAttributeValue }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeValueOps {

  implicit class JavaAttributeValueOps(val self: JavaAttributeValue) extends AnyVal {

    def toScala: ScalaAttributeValue = {
      ScalaAttributeValue()
        .withString(Option(self.s()))
        .withNumber(Option(self.n()))
        .withBinary(Option(self.b()).map(_.asByteArray()))
        .withStrings(Option(self.ss()).map(_.asScala))
        .withNumbers(Option(self.ns()).map(_.asScala))
        .withBinaries(Option(self.bs).map(_.asScala.map(_.asByteArray())))
        .withMap(Option(self.m()).map(_.asScala.toMap.mapValues(_.toScala)))
        .withList(Option(self.l()).map(_.asScala.toList.map(_.toScala)))
        .withNullValue(Option(self.nul()).map(_.booleanValue()))
        .withBool(Option(self.bool()).map(_.booleanValue))
    }

  }

  implicit class AttributeValueOps(val self: ScalaAttributeValue) extends AnyVal {

    def toJava: JavaAttributeValue = {
      val result = JavaAttributeValue.builder()
      self.string.foreach(v => if (v.nonEmpty) result.s(v))
      self.number.foreach(v => if (v.nonEmpty) result.n(v))
      self.binary.foreach(v => if (v.nonEmpty) result.b(SdkBytes.fromByteArray(v)))
      self.strings.foreach(v => if (v.nonEmpty) result.ss(v.asJava))
      self.numbers.foreach(v => if (v.nonEmpty) result.ns(v.asJava))
      self.binaries.foreach(v => if (v.nonEmpty) result.bs(v.map(v => SdkBytes.fromByteArray(v)).asJava))
      self.map.foreach(v => if (v.nonEmpty) result.m(v.mapValues(_.toJava).asJava))
      self.list.foreach(v => if (v.nonEmpty) result.l(v.map(_.toJava).asJava))
      self.nullValue.foreach(v => result.nul(v))
      self.bool.foreach(v => result.bool(v))
      result.build()
    }

  }
}
