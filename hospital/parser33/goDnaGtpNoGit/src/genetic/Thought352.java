package genetic;
import java.util.ArrayList;
class Thought352 extends Thought{
private static ArrayList<Thought352> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 1.4547624948371038;
private double fd1 = 391.5126006938131;
private Thought fo0 = null;
private Thought fo1 = null;
Thought352 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought352 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought352 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought352 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought352 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought352 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought352 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought352 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought352 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought352 instance = new Thought352 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought352 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought352 instance = new Thought352 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought352 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought352 instance = new Thought352 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought352 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought352 instance = new Thought352 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought352 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought352 instance = new Thought352 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought352 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought352 instance = new Thought352 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought352 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought352 instance = new Thought352 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought352 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought352 instance = new Thought352 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[7][2] += fd0;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = lb2 && fb0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    lb1 = !lb2;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb1, lb2, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    double ld1 = 918.2524720235191;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[7][3] -= fd0;
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    ab4 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[7][4] -= fd1;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - ld1;
    Thought lo2 = Thought281.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    Output.points[7][5] -= fd0;
    Thought lo3 = Thought3.getInstance(fo0, fo1, fo0, fo1);
    fd1 = ld1 + fd0;
    boolean lb4 = false;
    lb0 = fd1 < ld1;
    lb4 = !ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
    fd0 = fd1 + ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought138.getInstance(ad2, ad3, ad4, fd0);
    fb1 = !fb0;
    Thought lo1 = Thought374.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    if (fb1) {
        double ld2 = 729.8020107672062;
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo1 != null){
          ad3 = fo1.m3(fb1, fb0, fb1, fb0);
}
        Output.points[7][6] -= ad4;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < ld2;
        fb0 = ad1 < ad2;
        fb1 = ad3 < ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
            fb0 = ld2 > ad1;
            fb1 = fb0 || fb1;
            fb0 = ad2 < ad3;
            ad4 = fd0 + fd1;
            double ld3 = 242.99172316147641;
            boolean lb4 = false;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab2 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought164.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    fd1 = ad1 + ad2;
    ab4 = fb0 || fb1;
    if (lb0) {
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        for(int i0=0; i0<10; i0++){
            Thought lo2 = Thought176.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought125.getInstance();
    Thought lo1 = Thought110.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    double ld2 = 528.6947407406294;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    ld2 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = ld2 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
        boolean lb0 = false;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              ad3 = fo1.m3();
}
            Thought lo1 = Thought71.getInstance(fb0, fb1, lb0, fb0);
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
            lb0 = fb0 || fb1;
            ad2 = ad3 + ad4;
            lb0 = fd0 < fd1;
if(ao1 != null){
              ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
            boolean lb2 = false;
            fd1 *= -1;
            fb0 = ad1 > ad2;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb2, lb0, fb0);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            ad3 = ad4 + fd0;
if(ao2 != null){
              fd1 = ao2.m3(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
              fb1 = ao2.m2();
}
if(ao3 != null){
              ao3.m2(lb2, lb0, fb0, fb1);
}
            ad3 = ad4 + fd0;
            lb2 = lb0 && fb0;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Output.points[7][7] -= fd1;
    double ld1 = 481.887109226809;
if(ao2 != null){
      ao2.m1(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ab4 = fb0 || fb1;
    Thought lo3 = Thought99.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
    if (lb0) {
        fd0 = fd1 + ld1;
        Output.points[7][8] -= fd0;
        fd1 = ld1 + fd0;
if(fo1 != null){
          fo1.m1(fd1, ld1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
        lb2 = fd0 < fd1;
        boolean lb4 = true;
        Output.points[8][0] += ld1;
        boolean lb5 = false;
        double ld6 = 743.9083471722346;
        Output.points[8][1] -= ld1;
        lb0 = !lb2;
        ab1 = fd0 > fd1;
        boolean lb7 = true;
        ab1 = ab2 || ab3;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought339.getInstance();
    double ld1 = 2.507244487697352;
if(ao1 != null){
      ld1 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
    fd1 = ld1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = fb0 && fb1;
    boolean lb3 = true;
    lb2 = lb3 || ab1;
if(ao2 != null){
      ab2 = ao2.m2(ad2, ad3, ad4, fd0);
}
    ab3 = !ab4;
    fd1 = ld1 + ad1;
    fb0 = ad2 > ad3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought164.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m2(lb0, ab1, ab2, ab3);
}
    double ld1 = 938.594373354107;
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    Thought lo5 = Thought123.getInstance(fo1, fo0, fo1, fo0, lb3, lb4, ab1, ab2);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = !ab4;
    boolean lb6 = true;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    ab4 = fd1 > ld1;
    fd0 = fd1 + ld1;
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            fd0 *= -1;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
              fo1 = fo0.m4();
}
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    fb1 = !fb0;
if(fo1 != null){
      ad3 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < ad1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld2 = 874.2197203512006;
    Thought lo3 = Thought374.getInstance(ad1, ad2, ad3, ad4);
    double ld4 = 975.3131462648041;
    Thought lo5 = Thought106.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
    fb0 = ld4 > ad1;
    double ld6 = 218.95933821398847;
if(fo1 != null){
          fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ad4 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought360.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
    double ld2 = 455.1809983356749;
    double ld3 = 819.2420597211111;
if(fo0 != null){
      ld3 = fo0.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld2;
    Thought lo4 = Thought372.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[8][2] += ld3;
    ab4 = ad1 > ad2;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Thought lo0 = Thought252.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    boolean lb1 = false;
if(ao1 != null){
      fd1 = ao1.m3();
}
    fd0 = fd1 + fd0;
    double ld2 = 252.6579640790609;
    double ld3 = 132.43901761817202;
    lb1 = ld3 > fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld2, ld3, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ld2, ld3, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ld2 *= -1;
    fb0 = ld3 > fd0;
    fd1 *= -1;
    Thought lo4 = Thought323.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
    boolean lb5 = false;
    lb1 = ld2 > ld3;

Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought256.getInstance(ao1, ao2, ao3, ao4);
    Output.points[8][3] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1();
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    Output.points[8][4] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
    Thought lo1 = Thought20.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld2 = 760.7003535881008;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, ad1);
}
    fb1 = ad2 > ad3;
    ad4 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought284.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][5] += fd0;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld3 = 636.9257720195103;
    ld3 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    boolean lb0 = true;
    double ld1 = 970.4814767744068;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought34.getInstance(ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
    Output.points[8][6] += ad4;
    Thought lo3 = Thought325.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb1 = lb0 && ab1;
    double ld4 = 314.530588939066;
    boolean lb5 = true;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld1, ld4);
}
    ab1 = !ab2;
    ad1 = ad2 + ad3;
    boolean lb6 = true;
    Thought lo7 = Thought51.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1);
    ld4 = ad1 + ad2;
    Output.points[8][7] += ad3;
    boolean lb8 = true;
if(ao4 != null){
      ao4.m3();
}
    if (ab1) {
        boolean lb9 = false;
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < fd0;
    fb0 = fd1 > fd0;
        fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    Thought lo2 = Thought96.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
    Thought lo3 = Thought147.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 828.399847036122;
    ab2 = !ab3;
    fd0 = fd1 - ld0;
    Output.points[8][8] += fd0;
    double ld1 = 944.9351341553842;
    double ld2 = 203.90895414284142;
    ab4 = !fb0;
    Thought lo3 = Thought92.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
    ld1 = ld2 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought35.getInstance(fb1, ab1, ab2, ab3);
    if (ab4) {
        boolean lb5 = true;
        ab4 = fd1 < ld0;
}
Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought227.getInstance(fd1, ad1, ad2, ad3);
    Output.points[0][0] -= ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[0][1] += ad1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = !ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = false;
    lb0 = fd1 < fd0;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    lb1 = lb2 || fb0;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    Thought lo3 = Thought65.getInstance(lb0, lb1, lb2, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    Output.points[0][2] += fd1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[0][3] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    double ld0 = 635.5806821338061;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought259.getInstance(ld0, ad1, ad2, ad3);
    fb0 = !fb1;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      ad2 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    Thought lo2 = Thought100.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = ad3 > ad4;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb3, fb0);
}
    fb1 = ad4 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    Output.points[0][4] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought384.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
    ab2 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    Output.points[0][5] -= fd0;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m3();
}
    fb1 = fd1 > ad1;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
    ad4 *= -1;
    Output.points[0][6] += fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought237.getInstance(fo1, ao1, ao2, ao3);
    boolean lb2 = true;
    Output.points[0][7] += fd0;
    double ld3 = 811.9033401537974;
    Output.points[0][8] -= fd0;
if(ao4 != null){
      ao4.m2(fd1, ld3, ad1, ad2);
}
    Thought lo4 = Thought27.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought332.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought167.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Output.points[1][0] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[1][1] += fd0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 169.28878284075878;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][2] += fd0;
        ab4 = fd1 > fd0;
    double ld0 = 430.859919454021;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought365.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    Thought lo1 = Thought123.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    ad3 = ad4 + fd0;
    lb3 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb2, lb3, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2, lb2, lb3, fb0, fb1);
}
    Thought lo4 = Thought170.getInstance(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
    lb2 = lb3 && fb0;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    double ld5 = 185.85971085515607;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb6 = true;
    if (fb0) {
        ld5 *= -1;
        fb1 = lb2 && lb3;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought64.getInstance(ad2, ad3, ad4, fd0);
    Thought lo1 = Thought379.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ab1 = ad4 < fd0;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    fd1 = ad1 + ad2;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ad3 = ad4 - fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    boolean lb2 = false;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb2;
    Thought lo3 = Thought397.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, ab1, ab2);
}
    boolean lb4 = false;
    ab2 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = !ab4;
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(lb2, lb4, ab1, ab2);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld1 = 198.2551875493606;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    lb0 = !fb0;
    fd1 *= -1;
    fb1 = lb0 && fb0;
    double ld2 = 564.9780143034676;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd0 = ao3.m3(fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
        Thought lo1 = Thought295.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
        fb1 = ad4 < fd0;
        lb0 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        }
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought301.getInstance(ao4, fo0, fo1, ao1);
    Thought lo3 = Thought123.getInstance(ad4, fd0, fd1, ad1);
    Output.points[1][3] += ad2;
    fb0 = ad3 < ad4;
    Thought lo4 = Thought65.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    Output.points[1][4] += ad3;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb5 = true;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(lb5, fb0, fb1, lb5);
}
    Thought lo6 = Thought238.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb5, fb0);
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3, fb1, lb5, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb5, fb0, fb1, lb5);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    Output.points[1][5] -= fd1;
    ab3 = ab4 || fb0;
    Thought lo0 = Thought77.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb1 = !ab1;
    fd1 *= -1;
    boolean lb1 = false;
    fd0 *= -1;
    fd1 *= -1;
    ab1 = fd0 > fd1;
if(ao1 != null){
      ab2 = ao1.m2();
}
    fd0 = fd1 - fd0;
    ab3 = fd1 > fd0;
    ab4 = fb0 || fb1;
    boolean lb2 = true;
    double ld3 = 207.6917166357609;
if(ao2 != null){
      lb1 = ao2.m2(lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought398.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ab2 = ao2.m2();
}
        ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    double ld0 = 26.198217196180916;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo0 = Thought149.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd0 < fd1;
        boolean lb1 = true;
    boolean lb2 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Thought lo0 = Thought263.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought53.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld2 = 265.5257147020738;
if(fo1 != null){
      fb1 = fo1.m2();
}
    ld2 = fd0 - fd1;
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
    ld2 = fd0 + fd1;
    double ld3 = 124.45755450597385;
    fb0 = ld2 < ld3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, ld3, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[1][6] -= fd1;
    Thought lo4 = Thought111.getInstance(ld2, ld3, fd0, fd1, fb1, fb0, fb1, fb0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
