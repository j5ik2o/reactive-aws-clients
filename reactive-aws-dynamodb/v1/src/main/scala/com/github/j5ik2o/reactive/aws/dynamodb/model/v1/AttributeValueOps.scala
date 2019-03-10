package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import java.nio.ByteBuffer

import com.amazonaws.services.dynamodbv2.model.{ AttributeValue => JavaAttributeValue }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue => ScalaAttributeValue }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AttributeValueOps {

  implicit class JavaAttributeValueOps(val self: JavaAttributeValue) extends AnyVal {

    def toScala: ScalaAttributeValue = {
      ScalaAttributeValue()
        .withString(Option(self.getS))
        .withNumber(Option(self.getN))
        .withBinary(Option(self.getB).map(_.array()))
        .withStrings(Option(self.getSS).map(_.asScala))
        .withNumbers(Option(self.getNS).map(_.asScala))
        .withBinaries(Option(self.getBS).map(_.asScala.map(_.array())))
        .withMap(Option(self.getM).map(_.asScala.toMap.mapValues(_.toScala)))
        .withList(Option(self.getL).map(_.asScala.toList.map(_.toScala)))
        .withNullValue(Option(self.getNULL).map(_.booleanValue()))
        .withBool(Option(self.getBOOL).map(_.booleanValue()))
    }

  }

  implicit class ScalaAttributeValueOps(val self: ScalaAttributeValue) extends AnyVal {

    def toJava: JavaAttributeValue = {
      val result = new JavaAttributeValue()
      self.string.foreach(v => if (v.nonEmpty) result.setS(v))
      self.number.foreach(v => if (v.nonEmpty) result.setN(v))
      self.binary.map(ByteBuffer.wrap).foreach(v => if (v.array().nonEmpty) result.setB(v))
      self.strings.foreach(v => if (v.nonEmpty) result.setSS(v.asJava))
      self.numbers.foreach(v => if (v.nonEmpty) result.setNS(v.asJava))
      self.binaries.foreach(v => if (v.nonEmpty) result.setBS(v.map(ByteBuffer.wrap).asJava))
      self.map.foreach(v => if (v.nonEmpty) result.setM(v.mapValues(_.toJava).asJava))
      self.list.foreach(v => if (v.nonEmpty) result.setL(v.map(_.toJava).asJava))
      self.nullValue.foreach(v => result.setNULL(v))
      self.bool.foreach(v => result.setBOOL(v))
      result
    }

  }

}
