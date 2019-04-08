// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetItemRequestBuilderOps(val self: GetItemRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): GetItemRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def keyAsScala(value: Option[Map[String, AttributeValue]]): GetItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.key(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def attributesToGetAsScala(value: Option[Seq[String]]): GetItemRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributesToGet(v.asJava)
    } // Seq[String]
  }

  final def consistentReadAsScala(value: Option[Boolean]): GetItemRequest.Builder = {
    value.fold(self) { v =>
      self.consistentRead(v)
    }
  } // Boolean

  final def returnConsumedCapacityAsScala(value: Option[ReturnConsumedCapacity]): GetItemRequest.Builder = {
    value.fold(self) { v =>
      self.returnConsumedCapacity(v)
    }
  } // String

  final def projectionExpressionAsScala(value: Option[String]): GetItemRequest.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  } // String

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): GetItemRequest.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

}

final class GetItemRequestOps(val self: GetItemRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def attributesToGetAsScala: Option[Seq[String]] = Option(self.attributesToGet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead) // Boolean

  final def returnConsumedCapacityAsScala: Option[ReturnConsumedCapacity] =
    Option(self.returnConsumedCapacity) // String

  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression) // String

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetItemRequestOps {

  implicit def toGetItemRequestBuilderOps(v: GetItemRequest.Builder): GetItemRequestBuilderOps =
    new GetItemRequestBuilderOps(v)

  implicit def toGetItemRequestOps(v: GetItemRequest): GetItemRequestOps = new GetItemRequestOps(v)

}
