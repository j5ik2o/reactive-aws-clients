// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteBuilderOps(val self: Delete.Builder) extends AnyVal {

  final def keyAsScala(value: Option[Map[String, AttributeValue]]): Delete.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.key(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def tableNameAsScala(value: Option[String]): Delete.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def conditionExpressionAsScala(value: Option[String]): Delete.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  } // String

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): Delete.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): Delete.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def returnValuesOnConditionCheckFailureAsScala(
      value: Option[ReturnValuesOnConditionCheckFailure]
  ): Delete.Builder = {
    value.fold(self) { v =>
      self.returnValuesOnConditionCheckFailure(v)
    }
  } // String

}

final class DeleteOps(val self: Delete) extends AnyVal {

  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def conditionExpressionAsScala: Option[String] = Option(self.conditionExpression) // String

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    } // Map[String, AttributeValue]

  final def returnValuesOnConditionCheckFailureAsScala: Option[ReturnValuesOnConditionCheckFailure] =
    Option(self.returnValuesOnConditionCheckFailure) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteOps {

  implicit def toDeleteBuilderOps(v: Delete.Builder): DeleteBuilderOps = new DeleteBuilderOps(v)

  implicit def toDeleteOps(v: Delete): DeleteOps = new DeleteOps(v)

}
