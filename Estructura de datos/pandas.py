# %%
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import MinMaxScaler, StandardScaler

#Carga de datos

datos = pd.read_csv("/Users/garethcastro/Downloads/Border_Crossing_Entry_Data.csv")

datos.head()
# %%
