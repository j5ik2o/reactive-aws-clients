// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamRecord => ScalaStreamRecord, _ }
import software.amazon.awssdk.services.dynamodb.model.{ StreamRecord => JavaStreamRecord }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamRecordOps {

  implicit class ScalaStreamRecordOps(val self: ScalaStreamRecord) extends AnyVal {

    def toJava: JavaStreamRecord = {
      val result = JavaStreamRecord.builder()
      self.approximateCreationDateTime.foreach(v => result.approximateCreationDateTime(v)) // Instant
      self.keys.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.keys(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.newImage.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.newImage(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.oldImage.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.oldImage(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.sequenceNumber(v)) // String
      self.sizeBytes.map(_.longValue).foreach(v => result.sizeBytes(v))             // Long
      self.streamViewType.foreach { v =>
        import StreamViewTypeOps._; result.streamViewType(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaStreamRecordOps(val self: JavaStreamRecord) extends AnyVal {

    def toScala: ScalaStreamRecord = {
      ScalaStreamRecord()
        .withApproximateCreationDateTime(Option(self.approximateCreationDateTime)) // Instant
        .withKeys(Option(self.keys).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withNewImage(Option(self.newImage).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withOldImage(Option(self.oldImage).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withSequenceNumber(Option(self.sequenceNumber)) // String
        .withSizeBytes(Option(self.sizeBytes).map(_.longValue)) // Long
        .withStreamViewType(Option(self.streamViewType).map { v =>
          import StreamViewTypeOps._; v.toScala
        }) // String
    }

  }

}
