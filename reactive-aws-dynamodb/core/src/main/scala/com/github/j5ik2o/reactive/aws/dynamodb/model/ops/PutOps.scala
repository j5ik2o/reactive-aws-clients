// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutBuilderOps(val self: Put.Builder) extends AnyVal {

  final def itemAsScala(value: Option[Map[String, AttributeValue]]): Put.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.item(v.asJava)
    }
  }

  final def tableNameAsScala(value: Option[String]): Put.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def conditionExpressionAsScala(value: Option[String]): Put.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  }

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): Put.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    }
  }

  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): Put.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    }
  }

  final def returnValuesOnConditionCheckFailureAsScala(
      value: Option[ReturnValuesOnConditionCheckFailure]
  ): Put.Builder = {
    value.fold(self) { v =>
      self.returnValuesOnConditionCheckFailure(v)
    }
  }

}

final class PutOps(val self: Put) extends AnyVal {

  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
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
trait ToPutOps {

  implicit def toPutBuilderOps(v: Put.Builder): PutBuilderOps = new PutBuilderOps(v)

  implicit def toPutOps(v: Put): PutOps = new PutOps(v)

}
