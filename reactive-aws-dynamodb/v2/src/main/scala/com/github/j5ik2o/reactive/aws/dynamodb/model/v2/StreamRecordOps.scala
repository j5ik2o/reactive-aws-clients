package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamRecord => ScalaStreamRecord, _ }
import software.amazon.awssdk.services.dynamodb.model.{ StreamRecord => JavaStreamRecord }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamRecordOps {

  implicit class ScalaStreamRecordOps(val self: ScalaStreamRecord) extends AnyVal {

    def toJava: JavaStreamRecord = {
      val result = JavaStreamRecord.builder()
                                                          self.approximateCreationDateTime.foreach(v => result.approximateCreationDateTime(v)) // Instant, case java.time.Instant
                              self.keys.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.keys(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined
                              self.newImage.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.newImage(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined
                              self.oldImage.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.oldImage(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined
                      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.sequenceNumber(v)) // String, case String
                      self.sizeBytes.map(_.longValue).foreach(v => result.sizeBytes(v)) // Long, case Long
                      self.streamViewType.foreach{ v => import StreamViewTypeOps._; result.streamViewType(v.toJava) } // String, case Other

      result.build()
    }

  }

  implicit class JavaStreamRecordOps(val self: JavaStreamRecord) extends AnyVal {

     def toScala: ScalaStreamRecord = {
       ScalaStreamRecord()
            .withApproximateCreationDateTime(Option(self.approximateCreationDateTime)) // Instant, Map-11
                    .withKeys(Option(self.keys).map{ v => import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala) }) // Map[String, AttributeValue], Map-8
                    .withNewImage(Option(self.newImage).map{ v => import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala) }) // Map[String, AttributeValue], Map-8
                    .withOldImage(Option(self.oldImage).map{ v => import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala) }) // Map[String, AttributeValue], Map-8
            .withSequenceNumber(Option(self.sequenceNumber)) // String
            .withSizeBytes(Option(self.sizeBytes).map(_.longValue)) // Long
            .withStreamViewType(Option(self.streamViewType).map{ v => import StreamViewTypeOps._; v.toScala}) // String, Map-12
     }

   }

}