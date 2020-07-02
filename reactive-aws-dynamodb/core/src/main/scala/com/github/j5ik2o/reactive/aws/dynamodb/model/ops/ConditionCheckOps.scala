// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ConditionCheckBuilderOps(val self: ConditionCheck.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[Map[String, AttributeValue]]): ConditionCheck.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.key(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): ConditionCheck.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionExpressionAsScala(value: Option[String]): ConditionCheck.Builder = {
    value.fold(self) { v => self.conditionExpression(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): ConditionCheck.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): ConditionCheck.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeValues(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValuesOnConditionCheckFailureAsScala(
      value: Option[ReturnValuesOnConditionCheckFailure]
  ): ConditionCheck.Builder = {
    value.fold(self) { v => self.returnValuesOnConditionCheckFailure(v) }
  }

}

final class ConditionCheckOps(val self: ConditionCheck) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[Map[String, AttributeValue]] =
    Option(self.key).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionExpressionAsScala: Option[String] = Option(self.conditionExpression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala: Option[Map[String, String]] =
    Option(self.expressionAttributeNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValuesOnConditionCheckFailureAsScala: Option[ReturnValuesOnConditionCheckFailure] =
    Option(self.returnValuesOnConditionCheckFailure)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConditionCheckOps {

  implicit def toConditionCheckBuilderOps(v: ConditionCheck.Builder): ConditionCheckBuilderOps =
    new ConditionCheckBuilderOps(v)

  implicit def toConditionCheckOps(v: ConditionCheck): ConditionCheckOps = new ConditionCheckOps(v)

}
