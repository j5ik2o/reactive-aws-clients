// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamRecord => ScalaStreamRecord, _ }
import com.amazonaws.services.dynamodbv2.model.{ StreamRecord => JavaStreamRecord }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamRecordOps {

  implicit class ScalaStreamRecordOps(val self: ScalaStreamRecord) extends AnyVal {

    def toJava: JavaStreamRecord = {
      val result = new JavaStreamRecord()
      self.approximateCreationDateTime
        .map(java.util.Date.from).foreach(v => result.withApproximateCreationDateTime(v)) // Instant
      self.keys.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withKeys(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.newImage.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withNewImage(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.oldImage.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withOldImage(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.withSequenceNumber(v)) // String
      self.sizeBytes.map(_.longValue).foreach(v => result.withSizeBytes(v))             // Long
      self.streamViewType.foreach { v =>
        import StreamViewTypeOps._; result.withStreamViewType(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaStreamRecordOps(val self: JavaStreamRecord) extends AnyVal {

    def toScala: ScalaStreamRecord = {
      ScalaStreamRecord()
        .withApproximateCreationDateTime(Option(self.getApproximateCreationDateTime).map(_.toInstant)) // Instant
        .withKeys(Option(self.getKeys).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withNewImage(Option(self.getNewImage).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withOldImage(Option(self.getOldImage).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withSequenceNumber(Option(self.getSequenceNumber)) // String
        .withSizeBytes(Option(self.getSizeBytes).map(_.longValue)) // Long
        .withStreamViewType(Option(self.getStreamViewType).map { v =>
          import StreamViewTypeOps._; v.toScala
        }) // String
    }

  }

}
