import pandas as pd

def duplicate_emails(person: pd.DataFrame) -> pd.DataFrame:
    grouped = person.groupby('email').size().reset_index(name='count')
    duplicates = grouped[grouped['count'] > 1]
    return duplicates[['email']].rename(columns={'email': 'Email'})
