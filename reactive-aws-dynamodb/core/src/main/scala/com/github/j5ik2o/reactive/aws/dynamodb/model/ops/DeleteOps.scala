// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteBuilderOps(val self: Delete.Builder) extends AnyVal {

  final def keyAsScala(value: Option[Map[String, AttributeValue]]): Delete.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.key(v.asJava)
    }
  }

  final def tableNameAsScala(value: Option[String]): Delete.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def conditionExpressionAsScala(value: Option[String]): Delete.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  }

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): Delete.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    }
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): Delete.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    }
  }

  final def returnValuesOnConditionCheckFailureAsScala(
      value: Option[ReturnValuesOnConditionCheckFailure]
  ): Delete.Builder = {
    value.fold(self) { v =>
      self.returnValuesOnConditionCheckFailure(v)
    }
  }

}

final class DeleteOps(val self: Delete) extends AnyVal {

  final def keyAsScala: Option[Map[String, AttributeValue]] = Option(self.key).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def conditionExpressionAsScala: Option[String] = Option(self.conditionExpression)

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    }

  final def returnValuesOnConditionCheckFailureAsScala: Option[ReturnValuesOnConditionCheckFailure] =
    Option(self.returnValuesOnConditionCheckFailure)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteOps {

  implicit def toDeleteBuilderOps(v: Delete.Builder): DeleteBuilderOps = new DeleteBuilderOps(v)

  implicit def toDeleteOps(v: Delete): DeleteOps = new DeleteOps(v)

}
