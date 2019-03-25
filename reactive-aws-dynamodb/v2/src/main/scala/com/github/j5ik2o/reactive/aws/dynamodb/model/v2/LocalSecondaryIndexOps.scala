package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ LocalSecondaryIndex => ScalaLocalSecondaryIndex, _ }
import software.amazon.awssdk.services.dynamodb.model.{ LocalSecondaryIndex => JavaLocalSecondaryIndex }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LocalSecondaryIndexOps {

  implicit class ScalaLocalSecondaryIndexOps(val self: ScalaLocalSecondaryIndex) extends AnyVal {

    def toJava: JavaLocalSecondaryIndex = {
      val result = JavaLocalSecondaryIndex.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String, case String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.projection(v.toJava)
      } // Projection

      result.build()
    }

  }

  implicit class JavaLocalSecondaryIndexOps(val self: JavaLocalSecondaryIndex) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndex = {
      ScalaLocalSecondaryIndex()
        .withIndexName(Option(self.indexName)) // String
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.projection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
    }

  }

}
